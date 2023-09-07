package 秋招.京东;

/**
 * @ClassName: Sql
 * @Description:
 * @Author: lww
 * @Date: 8/30/23 7:42 PM
 * @Version: V1
 **/
public class Sql {
}

/*
SELECT A.name, A.id, B.score
FROM A
INNER JOIN B ON A.id = B.id
WHERE B.score = (
    SELECT MAX(score)
    FROM B
)
ORDER BY A.id;


*/