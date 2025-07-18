#include <iostream>
#include <string>
using namespace std;

// Define a Node structure for the linked list
struct Node {
    int id;
    string name;
    float marks;
    Node* next;
};

// Function to create a new node
Node* createNode(int id, string name, float marks) {
    Node* newNode = new Node();
    newNode->id = id;
    newNode->name = name;
    newNode->marks = marks;
    newNode->next = nullptr;
    return newNode;
}

// Function to traverse and display the linked list
void traverse(Node* head) {
    if (head == nullptr) {
        cout << "The list is empty.\n";
        return;
    }

    Node* temp = head;
    cout << "Student Records:\n";
    while (temp != nullptr) {
        cout << "ID: " << temp->id << ", Name: " << temp->name << ", Marks: " << temp->marks << endl;
        temp = temp->next;
    }
}

// Function to insert a new node at the end of the list
void insert(Node*& head, int id, string name, float marks) {
    Node* newNode = createNode(id, name, marks);
    if (head == nullptr) {
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != nullptr) {
        temp = temp->next;
    }
    temp->next = newNode;
}

// Function to update a student's details
void update(Node* head, int id) {
    if (head == nullptr) {
        cout << "The list is empty.\n";
        return;
    }

    Node* temp = head;
    while (temp != nullptr) {
        if (temp->id == id) {
            cout << "Enter new name: ";
            cin >> temp->name;
            cout << "Enter new marks: ";
            cin >> temp->marks;
            cout << "Record updated successfully!\n";
            return;
        }
        temp = temp->next;
    }

    cout << "Record not found.\n";
}

// Function to delete a node by ID
void deleteNode(Node*& head, int id) {
    if (head == nullptr) {
        cout << "The list is empty.\n";
        return;
    }

    if (head->id == id) {
        Node* temp = head;
        head = head->next;
        delete temp;
        cout << "Record deleted successfully!\n";
        return;
    }

    Node* temp = head;
    while (temp->next != nullptr && temp->next->id != id) {
        temp = temp->next;
    }

    if (temp->next == nullptr) {
        cout << "Record not found.\n";
        return;
    }

    Node* toDelete = temp->next;
    temp->next = temp->next->next;
    delete toDelete;
    cout << "Record deleted successfully!\n";
}

int main() {
    Node* head = nullptr;
    int choice, id;
    string name;
    float marks;

    do {
        cout << "\nMenu:\n";
        cout << "1. Traverse\n";
        cout << "2. Insert\n";
        cout << "3. Update\n";
        cout << "4. Delete\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                traverse(head);
                break;

            case 2:
                cout << "Enter ID: ";
                cin >> id;
                cout << "Enter name: ";
                cin >> name;
                cout << "Enter marks: ";
                cin >> marks;
                insert(head, id, name, marks);
                break;

            case 3:
                cout << "Enter ID to update: ";
                cin >> id;
                update(head, id);
                break;

            case 4:
                cout << "Enter ID to delete: ";
                cin >> id;
                deleteNode(head, id);
                break;

            case 5:
                cout << "Exiting program.\n";
                break;

            default:
                cout << "Invalid choice. Please try again.\n";
        }
    } while (choice != 5);

    return 0;
}
