package day8hashmapnheap;
import java.util.*;

public class D_8_2_ArrayofDoublePair {

	public static boolean canReorder(int[] A) {
		// Write your code here
		HashMap<Integer, Integer> fmap = new HashMap<>();

		for (int val : A) {
			fmap.put(val, fmap.getOrDefault(val, 0) + 1);
		}

		ArrayList<Integer> unique = new ArrayList<>(fmap.keySet());

		Collections.sort(unique);

		for (int val : unique) {
			int cnt = fmap.get(val);
			if (cnt == 0) {
				continue;
			}

			if (val == 0) {
				if ((cnt % 2) == 1) {
					return false;
				}
			} else {
				int k = val;
				if (val < 0) {
					if ((Math.abs(val) % 2) == 1) {
						return false;
					}
					k = k / 2;

				} else {
					k = 2 * k;
				}

				int cntk = fmap.getOrDefault(k, 0);

				if (cntk - cnt < 0) {
					return false;
				} else {
					fmap.put(k, cntk - cnt);
				}

			}
		}
		return true;
	}

	// Dont make changes here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		System.out.println(canReorder(a));

	}

=======
public class D_8_2_ArrayofDoublePair {

>>>>>>> a12f06f645222ae993cfe0708dd4c6bed04ac35e
}
