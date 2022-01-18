package dataStructure;

public class LinkedList {
	private Node head; // 첫번째 노드를 가리키는 필드
	private Node tail;
	private int size = 0;

	private class Node {
		// 객체 Node는 내부적으로 data와 next변수를 가지고 있습니다. data는 노드의 값이고, next는 다음 노드를 가리키는 참조값
		private Object data; // 데이터가 저장될 필드
		private Node next; // 다음 노드를 가리키는 필드

		public Node(Object input) { // input은 노드가 처음생겼을때 가지고 있어야하는 값
			this.data = input;
			this.next = null;
		}

		public String toString() { // 노드의 내용을 쉽게 출력해서 확인해 볼 수 있는 기능
			// Node 클래스에 "toString()"에 메소드를 재정의 하여 의미있는값을 지정해줌, 하지않을시 의미없는 디폴트값 출력
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input); // 노드를 생성한다.
		newNode.next = head; // 새로운 노드의 다음 노드로 해드를 지정
		head = newNode; // 헤드로 새로운 노드를 지정
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input); // 노드를 생성
		if (size == 0) { // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용
			addFirst(input);
		} else {
			tail.next = newNode; // 마지막 노드의 다음 노드로 생성한 노드를 지정
			tail = newNode; // 마지막 노드를 갱신
			size++; // 엘리먼트의 개수를 1 증가
		}
	}

	// 내부적으로만 사용할 API
	// 특정 위치의 노드를 찾아내는 방법
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public void add(int i, Object input) {
		if (i == 0) { // 만약 index가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
			addFirst(input);
		} else {
			Node pre = node(i - 1);
			Node aft = pre.next; // i 번째 노드를 aft로 지정
			Node newNode = new Node(input); // 새로운 노드를 생성
			pre.next = newNode; // pre의 다음 노드로 새로운 노드를 지정
			newNode.next = aft; // 새로운 노드의 다음 노드로 aft를 지정
			size++;
			if (newNode.next == null) { // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정
				tail = newNode;
			}
		}
	}

	public String toString() {
		if (head == null) { // 노드가 없다면 []를 리턴
			return "[]";
		}

		Node temp = head; // temp를 head로 지정
		String str = "[";
		while (temp.next != null) { // 다음 노드가 없을 때까지 반복문을 실행
			str += temp.data + ",";
			temp = temp.next; // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외된다.
		}
		str += temp.data; // 마지막 노드를 출력결과에 포함시킨다.
		return str + "]";
	}

	public Object removeFirst() {
		Node temp = head; // 첫번째 노드를 temp로 지정
		head = temp.next; // head의 값을 두번째 노드로 변경
		Object returnData = temp.data; // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담는다.
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int i) {
		if (i == 0)
			return removeFirst();
		Node pre = node(i - 1); // i-1번째 노드를 pre의 값으로 지정
		Node todoDeleted = pre.next; // 삭제 노드를 todoDeleted에 기록, 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없다.
		pre.next = pre.next.next; // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정
		Object returnData = todoDeleted.data; // 삭제된 데이터를 리턴하기 위해 returnData에 데이터를 지정
		if (todoDeleted == tail) {
			tail = pre;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}

	public Object removeLast() {
		return remove(size - 1);
	}

	public int size() {
		return size;
	}

	public Object get(int i) {
		Node temp = node(i);
		return temp.data;
	}

	public int indexOf(Object data) {
		Node temp = head; // 탐색 대상이 되는 노드를 temp로 지정
		int index = 0; // 탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 사용
		while (temp.data != data) { // 탐색 값과 탐색 대상의 값을 비교
			temp = temp.next;
			index++;
			if (temp == null) // temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것을 의미
				return -1;
		}
		return index; // 탐색 대상을 찾았다면 대상의 인덱스 값을 리턴
	}

	public ListIterator listIterator() { // LinkedList의 listiterator 메소드를 만든다.
		return new ListIterator();
	}

	class ListIterator {
		private Node lastReturned;
		private Node next;
		private int nextIndex;

		ListIterator() {
			next = head;
			nextIndex = 0;
		}

		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}

		public boolean hasNext() {
			return nextIndex < size();
		}

		public void add(Object input) {
			Node newNode = new Node(input);
			if (lastReturned == null) {
				head = newNode;
				newNode.next = next;
			} else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}

		public void remove() {
			if (nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(nextIndex - 1);
			nextIndex--;
		}
	}
}
