abstract class Bank
{
private String bankName; Bank(String bankName)
{
this.bankName = bankName;
}
public String getBankName()
{
return bankName;
}
}
class office extends Bank { office() {
super("Axis Bank");
}

public static void main(String[] args) { Bank bank = new office(); System.out.println(bank.getBankName());
}
}
