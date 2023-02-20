# spring-boot-jap-nativequery
해당 리파지토리는 JPA를 이용하여 NativeQuery로 쿼리를 작성하고, 작성한 쿼리로 DB를 제어하는 예시입니다.
예시에 사용된 쿼리는 SELECT문이 아닌 임의로 작성한 프로시저이며 MSSQL DBMS에서 작성하였습니다.

프로시저 작성 코드
'''
create PROC test
	@a int
AS
BEGIN
	DECLARE @result int
	SET @result = @a * @a
	SELECT @a as "num1", @result as "result"
END
'''

프로시저 실행 코드
exec test 2
