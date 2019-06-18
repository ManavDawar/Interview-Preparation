package day10hashmapandheap;

import java.util.*;

public class D_10_1_FourPairSum {

	// -----------------------------------------------------
	// This is a functional problem. Only this function has to be written.
	// This function takes as input the head of the linked list.
	// It should return the head of the modified list.

	public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (nums == null || nums.length < 4) {
			return list;
		}
		Arrays.sort(nums);
		if (4 * nums[0] > target || 4 * nums[nums.length - 1] < target) {
			return list;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int sumReq = target - (nums[i] + nums[j]);
				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					int sum = nums[left] + nums[right];
					if (sum < sumReq) {
						left++;
					} else if (sum > sumReq) {
						right--;
					} else {
						ArrayList<Integer> l = new ArrayList<>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[left]);
						l.add(nums[right]);
						list.add(l);

						while (left < right && nums[left] == nums[left - 1]) {
							left++;
						}
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
					}
				}
			}
		}
		return list;
	}

	// -----------------------------------------------------

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<ArrayList<Integer>> ans = fourSum(arr, target);

		for (ArrayList<Integer> a : ans) {
			for (int element : a) {
				System.out.print(element + ",");
			}
			System.out.println();
		}

	}

}
