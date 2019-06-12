package day5;

public class Kstacks {

	int[] da;
	int[] pa;
	int[] sha;
	int free = 0;
	int cap;

	public Kstacks(int cap, int k) {
		this.cap = cap;
		da = new int[cap];
		sha = new int[k + 1];
		pa = new int[cap];
		free = 0;

		for (int i = 0; i < cap - 1; i++) {
			pa[i] = i + 1;
		}
		pa[cap - 1] = -1;

		for (int i = 0; i <= k; i++) {
			sha[i] = -1;
		}
	}

	void push(int sn, int val) {
		if (isFull() == true) {
			System.out.println("OverFlow");
			return;
		} else {

			int temp=free;
//			free moves to next position	
			free=pa[free];
			
			pa[temp]=sha[sn];
			sha[sn]=temp;
			da[temp]=val;
			
			
//			int nfhead = pa[cfhead];
//			int nstackhead = cfhead;
//
////			removeFirst on free
//			cfhead = nfhead;
//
////			addFirst on stack
//			pa[nstackhead] = csheads[sn];
//			csheads[sn] = nstackhead;
//
//			da[nstackhead] = val;

		}
	}

	void pop(int sn) {
		if (isEmpty(sn) == true) {
			System.out.println("Underflow");
			return;
		} else {
//re
			int temp=sha[sn];
			sha[sn]=pa[temp];
			pa[temp]=free;
			free=temp;
			da[temp]=0;
			////			variables
//			int nstackhead = pa[csheads[sn]];
//			int nfhead = csheads[sn];
//
////			update
//			csheads[sn] = nstackhead;
//			pa[nfhead] = cfhead;
//			cfhead = nfhead;
//
//			da[nfhead] = 0;
		}
	}

	int top(int sn) {
		if (isEmpty(sn) == true) {
			System.out.println("underflow");
			return -1;
		} else {
			return da[sha[sn]];
		}
	}

	boolean isFull() {
		return free == -1;
	}

	boolean isEmpty(int sn) {
		return sha[sn] == -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kstacks ks = new Kstacks(10, 4);

		ks.push(1, 10);
		ks.push(2, 20);
		ks.push(2, 30);
		ks.push(4, 40);
		ks.push(4, 50);
		ks.push(1, 60);
		ks.push(3, 70);
		ks.push(3, 80);
		ks.push(4, 90);
		ks.push(2, 100);

		for (int i = 1; i <= 4; i++) {
			System.out.print("s"+i+"->");
			while (ks.isEmpty(i)==false) {
				int val=ks.top(i);
				ks.pop(i);
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}

}
