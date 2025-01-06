//
// Created by VEH-IT on 1/5/2025.
//

#include "que_1_b.h"
#include <iostream>
#include <string>
using namespace std;


struct Node{
    int a;
    float b;
    char c;
    Node* pre;
    Node* next;
};

Node* createNode(int a, float b, char c){
    Node* newNode=new Node();
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
        cout << "["<<data->a<<","<<data->b<<","<<data->c<<"]<->";
        data=data->next;
    }
    cout<<"Null"<<endl;

}
void insertAfter(Node* prevNode, int a, float b, char c){
    if (prevNode == nullptr){
        cout<<"Previous node can not be null"<<endl;
        return;
    }
    Node* newNode= createNode(a,b,c);
    newNode->next=prevNode->next;
    prevNode->next=newNode;

    newNode->pre=prevNode;
    if (newNode->next != nullptr){
        newNode->next->pre=newNode;
    }

}

int main(){
    Node* head= createNode(1,3.5,'X');
    Node* third= createNode(3,3.7,'Z');

    head->next=third;

    cout <<"Main doubly linked List:"<<endl;
    displayList(head);
    cout << "\nInserting new node (2, 4.00, 'Y') after the first node:" << endl;
    insertAfter(head, 2, 4.00, 'Y');

    displayList(head);

    return 0;
}
