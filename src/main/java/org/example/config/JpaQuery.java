package org.example.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.*;

public class JpaQuery {
    private static List executeNamedQuery(int paramValue) {
        EntityManager em = JpaUtils.getEntityManager();

        // 쿼리 단위 실행
        Query query = em.createNativeQuery("exec test :a");

        // 쿼리에 들어갈 파라미터 설정
        query.setParameter("a", 2);

        // 쿼리 결과를 리스트로 반환
        List<Object[]> resultList = query.getResultList();

        // 결과를 저장 할 변수 선언
        List result = new ArrayList<>();

        // 각 행의 열 저장
        for ( Object[] row : resultList ) {
            result.add( (Integer) row[0] );
            result.add( (Integer) row[1] );
        }

        em.close();
        return result;
    }

    public static List doNameQuery(int paramValue) {
        // 쿼리 결과 반환
        return executeNamedQuery(paramValue);
    }

}