import java.util.Iterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class MaoPaoSort {
	public static void main(String[] args) {
		int arr[] = {5,3,2,6,1};
		
		maopaoSortm(arr);
	}
	
	static void maopaoSortm(int[] arr){
		System.out.println("test");
		
		
		///imp思路：化繁为简，总结规律！通过 5 位数组，列举步骤，分析问题，总结规律，形成最终代码。
		int compareTimes = arr.length - 1;
		for(int i = 0;i< compareTimes;i++) {
			for(int j = 0;j< compareTimes  - i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
