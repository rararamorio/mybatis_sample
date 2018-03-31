package jp.sample.mybatis;

import java.io.IOException;
import java.io.InputStream;

import jp.sample.mybatis.entity.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Sample {

  /**
   * MyBatis動作確認用のサンプルプログラム
   *
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {
    try (InputStream in = Sample.class.getResourceAsStream("/mybatis-config.xml")) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        try (SqlSession session = factory.openSession()) {
          Person result = session.selectOne("person.selectByPersonId",Long.valueOf(1L));
          System.out.println(result);
        }
    }

  }
}
