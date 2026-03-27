//Actividad 2
class Monster {
    String name; // Nombre del monstruo
    String type; // Tipo de wyvern

    public Monster(String name, String type) {
        this.name = name; // Asigna el nombre
        this.type = type; // Asigna el tipo
    }

    @Override
    public String toString() {
        return "Monster: " + name + ", Type: " + type;
    }
}

class Node {
    Monster data; // Contiene el objeto Monster
    Node next; // Referencia al siguiente nodo

    public Node(Monster data) {
        this.data = data;
         this.next = null;
    }
}

class LinkedList {
    Node head;
    public void insertAtFirstPosition(Monster monster) {
        Node newNode = new Node(monster);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtLastPosition(Monster monster) {
        Node newNode = new Node(monster);
         if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Stack {
    private LinkedList stackList;

    public Stack() {
        stackList = new LinkedList();
    }

    public void push(Monster monster) {
        stackList.insertAtFirstPosition(monster);
    }

    public Monster pop() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        Monster data = stackList.head.data;
        stackList.head = stackList.head.next;
        return data;
    }

    public Monster peek() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        return stackList.head.data;
    }

    public boolean isEmpty() {
        return stackList.head == null;
    }
}

class Queue {
    private LinkedList queueList;

    public Queue() {
        queueList = new LinkedList();
    }

    public void enqueue(Monster monster) {
        queueList.insertAtLastPosition(monster);
    }

    public Monster dequeue() {
        if (isEmpty()) {
            System.out.println("Error: La cola está vacía.");
            return null;
        }
        Monster data = queueList.head.data;
        queueList.head = queueList.head.next;
        return data;
    }

    public Monster peek() {
        if (isEmpty()) {
            System.out.println("Error: La cola está vacía.");
            return null;
        }
        return queueList.head.data;
    }

    public boolean isEmpty() {
        return queueList.head == null;
    }
}

public class Bestiario {
    public static void main(String[] args) {
        System.out.println("--- Lista Enlazada de Monstruos ---");
        LinkedList monsterList = new LinkedList();

        Monster monster1 = new Monster("Rathalos", "Flying Wyvern");
        Monster monster2 = new Monster("Nergigante", "Elder Dragon");
        Monster monster3 = new Monster("Lagiacrus", "Leviathan");
        Monster monster4 = new Monster("Zinogre", "Fanged Wyvern");
        Monster monster5 = new Monster("Gore Magala", "Unknown");
        Monster monster6 = new Monster("Great Jaggi", "Bird Wyvern");
        
        monsterList.insertAtFirstPosition(monster1);
        monsterList.insertAtLastPosition(monster2);
        monsterList.insertAtFirstPosition(monster3);
        monsterList.insertAtLastPosition(monster4);
        monsterList.insertAtLastPosition(monster5);
        monsterList.insertAtFirstPosition(monster6);

        monsterList.printList();
        
        System.out.println("\n--- Pruebas de Pilas y Colas ---");
        
        System.out.println("\n--- Pila (Stack) ---");
        Stack monsterStack = new Stack();
        
        monsterStack.push(new Monster("Diablos", "Flying Wyvern"));
        monsterStack.push(new Monster("Tigrex", "Flying Wyvern"));
        monsterStack.push(new Monster("Astalos", "Fanged Wyvern"));
        
        System.out.println("Tope de la Pila (Peek): " + monsterStack.peek());
        System.out.println("Elemento removido (Pop): " + monsterStack.pop());
        System.out.println("Nuevo tope de la Pila: " + monsterStack.peek());
        System.out.println("Elemento removido (Pop): " + monsterStack.pop());

        System.out.println("\n--- Cola (Queue) ---");
        Queue monsterQueue = new Queue();

        monsterQueue.enqueue(new Monster("Glavenus", "Brute Wyvern"));
        monsterQueue.enqueue(new Monster("Mizutsune", "Leviathan"));
        monsterQueue.enqueue(new Monster("Valstrax", "Elder Dragon"));

        System.out.println("Frente de la Cola (Peek): " + monsterQueue.peek());
        System.out.println("Elemento removido (Dequeue): " + monsterQueue.dequeue());
        System.out.println("Nuevo frente de la Cola: " + monsterQueue.peek());
        System.out.println("Elemento removido (Dequeue): " + monsterQueue.dequeue());
    }
}