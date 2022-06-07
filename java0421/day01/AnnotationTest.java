/**
文档注释：可以通过 javadoc 命令生成说明文档

@author Hefei Li
@version v1.0
*/
public class AnnotationTest {

	//单行注释：不会被 JVM 解释执行的语句，就是注释语句
	//程序的入口
	public static void main(String[] args) {

		/*
			多行注释：多行注释中不能包含多行注释（多行注释不能嵌套）

			这是一条输出语句
		*/
		System.out.println("He\tllo \n Wor\tld!");
	}
}