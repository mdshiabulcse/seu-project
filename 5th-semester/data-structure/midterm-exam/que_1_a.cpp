#include <iostream>
using namespace std;

struct Node{
    int a;
    float b;
    char c;
    Node* pre;
    Node* next;
};

Node* createNode(int a, float b, char c){
    Node* newNode=(Node*)malloc(sizeof(Node));
    if(newNode == nullptr){
        cout << "Invalid Data"<<endl;
        exit(1);
    }
    newNode->a=a;
    newNode->b=b;
    newNode->c=c;
    newNode->pre= nullptr;
    newNode->next= nullptr;
    return newNode;

}
void displayList(Node* head){
    Node* data=head;
    while (data != nullptr){
        cout << "[" << data->a <<","<<data->b<<","<<data->c<<"]<->";
        data=data->next;
    }
    cout <<"Null"<<endl;
}

int main(){
    Node* head = createNode(1, 3.5,'X');
    Node* second = createNode(2,4.0,'Y');
    Node* third = createNode(3,3.7,'Z');

    head->next=second;
    second->pre=head;
    second->next=third;
    third->pre=second;

    cout << "Doubly Linked List:"<<endl;
    displayList(head);
    return 0;
}
