import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
        public int[] smallestK(int[] arr, int k) {
            if(arr.length == 0) {
                return arr;
            }
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
                public int compare(Integer num1, Integer num2) {
                    return num2 - num1;
                }
            });
            // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comperator<Integer>() {
            //     public int  compare(Integer n1,Integer n2) {
            //         return n2-n1;
            //     }
            // });
            //  for (int i = 0; i < k; ++i) {
            //         queue.offer(arr[i]);
            //     }

            for(int i=0;i<k;i++) {
                priorityQueue.offer(arr[i]);
            }
            for (int i = k; i < arr.length; ++i) {
                if (priorityQueue.peek() > arr[i]) {
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
            // for(int i=k;k<arr.length;i++) {
            //     if(priorityQueue.peek()>arr[i]) {
            //         priorityQueue.poll();
            //         priorityQueue.offer(arr[i]);
            //     }
            // }
            int[] arr1 = new int[k];
            for(int i=0;i<k;i++) {
                arr1[i] = priorityQueue.poll();
            }
            return arr1;

        }
    }