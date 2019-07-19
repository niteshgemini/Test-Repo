import java.util.Scanner;

class UniqueNumber {
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);

		// taking input form the user
		System.out.print("Enter a number : ");
		no = sc.nextInt();

		int temp = no;
		int secNo = no;
		boolean flag = false;
		int count;

		check: while(no > 0) {
			int rem = no % 10;

			// set count to 0 for each digit
			count = 0;
			while(secNo > 0) {
				if(secNo % 10 == rem) {
					// counting for each digit match
					count++;

					if(count > 1) {
						// get more than one time,so break the whole process
						flag = true;
						break check;
					}
				}
				secNo /= 10;
			}
			// getting back to the original one
			secNo = temp;
			no /= 10;
		}

		if(!flag)
			System.out.println(temp + " is a unique number.");
		else
			System.out.println(temp + " is not a unique number.");
	}
}