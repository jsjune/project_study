package dataStructure;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100]; // 100개의 데이터만을 수용할 수 있는 배열
	// 타입 Object는 String,Integer와 상속 관계, Object가 최상위 타입이므로 모든 객체는 Object타입으로 자동 타입
	// 변환될 수 있다.

	public boolean addFirst(Object element) {
		return add(0, element);
	}

	public boolean addLast(Object element) { // numbers.addLast(요소)
		elementData[size] = element; // elemenData[인덱스값]=요소
		size++;
		return true;
	}

	public boolean add(int index, Object element) {
		// 엘리먼트 중간에 데이터를 추가하기 위해서는 끝의 엘리먼트부터 index의 노드까지 뒤로 한칸씩 이동시켜야 한다.
		// 예) add(2,15) -> Data[4]=data[3], Data[3]=Data[2], Data[2]=15
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ",";
			}
		}
		return str + "]";
	}

	public Object remove(int index) {
		// 엘리먼트를 삭제하기 전에 삭제할 데이터를 removed 변수에 저장한다.
		Object removed = elementData[index];
		// 삭제된 엘리먼트 다음 엘리먼트부터 마지막 엘리먼트까지 순차적으로 이동해서 빈자리를 채운다.
		for (int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		// 크기를 줄인다.
		size--;
		// 마지막 위치의 데이터는 남아있으므로 마지막 위치의 엘리먼트를 명시적으로 삭제해준다.
		elementData[size] = null;
		return removed;
	}

	public Object removeFirst() {
		return remove(0);
	}

	public Object removeLast() {
		return remove(size - 1);
	}

	public Object get(int index) {
		return elementData[index];
	}

	public Object size() {
		return size;
	}

	public Object indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i])) { // .equals : 대상의 내용 자체를 비교, == : 대상의 주소값을 비교
				return i;
			}
		}
		return -1;
	}
	
	
	
}
