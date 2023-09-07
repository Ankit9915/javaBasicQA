package QaInterview;

public class ZeroFirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,6,0,5,0};
		int count =arr.length-1 ;
		for(int i =count;i>=0;i--) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
                count--;
			}
		}
		while(count>=0) {
			arr[count]=0;
			count--;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		String s ="Ankit";
		String ns = "a";
		ns = ns.replace("a", "aaaaa");
		ns = ns.replace("a", s+"\n");
		System.out.println(ns);
		
	
	String str = "Ankit";
    int n = str.length();

    if (n > 0) {
        String repeatedStr = new String(new char[n]).replace("\0", str + "\n");
        System.out.print(repeatedStr);
    } else {
        System.out.println("n must be a positive integer.");
    }


	char alpha = 'A';
	do {
		System.out.println(alpha);
		alpha++;
	}while(alpha<='Z');
	//without if else greater number
	int a = 10;
	int b= 20;
	System.out.println(a>b?a:b);
}
}
