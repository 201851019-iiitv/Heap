package finalimplents;

public class MaxHeap implements Heap {
	Object[] harr;
	int buffer;
	int size;
	MaxHeap(){
		size=0;
		buffer=5;
		harr=new Object[buffer];
	}
	public void checkIndex() {
		Object arr2[]=new Object[buffer*2];
		for(int i=0;i<=size;i++) {
			arr2[i]=harr[i];
		}
		harr=arr2;
		buffer=buffer*2;
		}

	public void Insert(int value) {
		if(size==buffer-1) {
			checkIndex();
		}
		size++;
	int 	pos=size;
	while(pos>1) {
	int parent=pos/2;
	if(value<=(int)harr[parent]) {
		harr[pos]=value;
		return;	
	}
	harr[pos]=harr[parent];
	pos=parent;	
	}
	harr[1]=value;
	return;
	}
	public int Deletion() {
	int parent =1,child;
	int  item,temp;
	if(size==0) {
		System.out.println("heap is empty");
		return -1;
	}
	item=(int) harr[parent];
	harr[parent]=harr[size];
	--size;
	temp=(int) harr[parent];
	parent=1;child=2;
	while(child<=size) {
	if((child+1<=size)&&((int)harr[child]<(int)harr[child+1])){
		child++;
		}
		if((int)harr[parent]>=(int)harr[child])
			break;
		harr[parent]=harr[child];
		parent=child;
		child*=2;
	}
	harr[parent]=temp;
	return item;
	}
		

	
	public void getMax() {
	System.out.println(harr[1]);	
	
	}
	public void traverseHeap() {
		for(int p=0;p<=size;p++) {
			System.out.println(harr[p]);
		}
	}

}
