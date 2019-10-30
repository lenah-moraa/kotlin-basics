

open class Account(name:String, number: String, balance:Double){
    var acc_name:String
    var acc_number:String
    var acc_balance:Double
    init {
        acc_name = name
        acc_number = number

        if (balance > 0) {
            acc_balance = balance
        } else {
            throw Exception("your account balance is 0")
        }


    }

    fun deposit (amount:Double){
        acc_balance+=amount
        println("deposit was successfull.new balance is $acc_balance")
    }


       open fun Withdraw (amount:Double)
    {
        if (amount>acc_balance){
            throw Exception ("no enough funds in the account . balance is $ acc_balance")
        }
        else{
            acc_balance=amount
            println("you have successfully withdrawn $amount .balance is $acc_balance ")
        }
    }
}
class  ChamaAccount(name: String,number: String,balance: Double,members:Array<String>):Account(name, number, balance)
{
    var account_members=members

    fun borrow_loan(amount: Double){
        if (amount<=this .acc_balance*3){
            println("loan successfully processed")
        }
        else {
            println("loan request declined")
        }
    }

    override fun Withdraw(amount: Double){
       var total_amount=amount+200
        if (total_amount>this.acc_balance){
            println("your account balance is low .KES $acc_balance")
        }
        else{
            acc_balance-=total_amount
            println("successfully withdrawn $amount .balance is $acc_balance")
        }

    }
}




fun main(args: Array<String>) {
    var acc1=Account("Lenah","A001",14000.0)
    var acc2=Account("moraa","A002",14000.0)
    var members= arrayOf("JOHN","MUSA","MARY")
  var chama1=ChamaAccount("Ummo Inner Sacco","A004", 10000.0,members)

    chama1.deposit(3000.0)
    chama1.Withdraw(1000.0)
    chama1.borrow_loan(70000.0)

   // acc1.deposit(2000.0)
  //  acc2.deposit(1000.0)


   // acc1.Withdraw(6500.0)
   // acc2.Withdraw(6300.0)
}