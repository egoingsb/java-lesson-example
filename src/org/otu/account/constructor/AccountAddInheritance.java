package org.otu.account.constructor;

// AccountAddConstructor 의 내용을 수정하면 안되는 상황에서 동작방법을 수정하고 싶은 경우에 상속을 이용했습니다. 

class AccountingCompleteMessage extends Accounting{

	AccountingCompleteMessage(double total, Person[] profitRate) {
		super(total, profitRate);
	}
	
	public String makeOutput() {
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+get_vat()+"\n";
		output += "총이익 : "+get_income() +"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += profitRate[i].getInfo()+"의 이익 : " + profitRate[i].profitRate * get_income() + "\n";
			i++; // i = i + 1과 같습니다. 
		}
		output += "complete!\n";
		return output;
	}
	
}

public class AccountAddInheritance {
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Michael", 0.5);
		Person p2 = new Person(2, "Calvin", 0.3);
		Person p3 = new Person(3, "Robin", 0.2);
		Person[] profitRate = {p1, p2, p3};
		AccountingCompleteMessage acc = new AccountingCompleteMessage(Double.parseDouble(args[0]), profitRate);
		String output = acc.makeOutput();
		Print.screen(output);
		Print.file(output);
	}
}
