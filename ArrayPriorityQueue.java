/*
  Team Name: 
  Team Members: Yu Qi Wu, Ri Hui Zheng, Jenny Han
  APCS2 pd3
  HW32 -- Getting Past the Velvet Rope
  2017-04-20
 */

public class ArrayPriorityQueue{
    private ArrayPriorityQueue _data;
    private int _size;

    public ArrayPriorityQueue{
	_data = new ArrayList();
	_size = 0;
    }

    public void add(int var){

    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public int peekMin(){
	return _data[0];
    }

    public int removeMin(){
	int temp = _data.peekMin();
	for (int i = 0; i < _size-1; i++)
	    _data[i] = _data[i+1];
	return temp;
    }
        
}

