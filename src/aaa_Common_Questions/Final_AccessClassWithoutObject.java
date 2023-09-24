package aaa_Common_Questions;

public class Final_AccessClassWithoutObject {
	public static void main(String[] args) {
//		System.out.println(AccessClassWithoutObject.display(12, 13));
//		int[] arr = { 1, 3, 4, 5, 6 };
//		System.out.println(ff(arr));
//		System.out.println(MissingNumber(arr));
//		System.out.println(missingNum(arr));
		stringImmutable();
	}

	//String is immutable
	public static void stringImmutable() {
		
		String n = "Zaman";
		n.concat("Khosruz");
		System.out.println(n);
		n =new String ("Molom");
		System.out.println(n);


	}

	public static int missingNum(int arr[]) {

		int sum = 0;
		int max = 0;

		for (int n : arr) {

			sum = sum + n;
			if (n > max)
				max = n;
		}

		return ((max) * (max + 1) / 2) - sum;
	}

	// Function to get missing number
	public static int MissingNumber(int[] arr) {
		int n = arr.length;
		int sum1 = ((n) * (n + 1)) / 2;
		int sum2 = 0;
		for (int i = 0; i < n; i++)
			sum2 += arr[i];
		return sum1 - sum2;
	}
}
