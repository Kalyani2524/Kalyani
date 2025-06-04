class RecursionDemo2{
static int SumNaturalNumbers(int n){
if(n==1){
return 1;
}
else{
return n+SumNaturalNumbers(n-1);
}
}
public static void main(String[] args){
int number=10;
int result=SumNaturalNumbers(number);
System.out.println("sum of first"+number+"natural number is"+result);
}
}