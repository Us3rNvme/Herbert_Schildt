/*
Упражнение 2.2
Отображение таблицы истинности для логических операций
*/

/*
В этом упражнении нам предстоит создать программу, которая 
отображает таблицу истинности для логических операций Java. 
Для удобства восприятия отображаемой информации следует 
выровнять столбцы таблицы. В данном примере используется ряд 
рассмотренных ранее средств языка, включая управляющие
последовательности и логические операторы, а также демонстрируются 
отличия в использовании приоритетов арифметических и логических операторов. 
Поэтапное описание процесса создания программы приведено ниже. 
*/

class LogicalOpTable {
	public static void main (String[] args) {
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT"); 
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}
}
