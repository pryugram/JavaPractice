package encapsulation;

public class Printer {
private int tonerLevel;
private int pagesPrinted;
private boolean duplex;
public Printer(int tonerLevel, boolean duplex) {

	if(tonerLevel > -1 && tonerLevel <= 100)
	{
		this.tonerLevel = tonerLevel;
	}
	else
	{
		this.tonerLevel = -1;
	}
	this.duplex = duplex;
	this.pagesPrinted = 0;
}

public int addToner(int tonerAmount) {
	if(tonerAmount > 0 && tonerAmount <= 100)
	{
		if(this.tonerLevel + tonerAmount > 100)
		{
			return -1;
		}
		else
		{
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}
	}
	else
	{
		return -1;
	}
}

public int printPages(int pages) {
	int pagesToPrint = pages;
	if(this.duplex) 
	{
		pagesToPrint = pages / 2 + pages % 2;
		System.out.println("Printing in duplex mode");
	}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
}

public int getPagesPrinted() {
	return pagesPrinted;
}


public static void main(String[] args) {
	Printer printer = new Printer(50, true);
	System.out.println(printer.addToner(50));
	System.out.println("initial page count = " + printer.getPagesPrinted());
	int pagesPrinted = printer.printPages(4);
	System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	pagesPrinted = printer.printPages(2);
	System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	
}

	
	

}
