//
// Created by VEH-IT on 1/6/2025.
//

#include "que_2.h"
#include <iostream>
using namespace std;
struct Node{
    float floatValue;
    string charValue;
    int intValue;
    Node* next;
};

Node* createNode( string charValue,float floatValue,int intValue){
    Node* newNode=new Node();
    newNode->floatValue=floatValue;
    newNode->charValue=charValue;
    newNode->intValue=intValue;
    newNode->next= nullptr;
    return newNode;

}
void printList(Node* head){
    Node* data=head;
    while (data != nullptr){
        cout << "[" << data->charValue << ", " << data->floatValue << ", " << data->intValue << "] -> ";
        data=data->next;
    }
    cout <<"Null"<<endl;
}
void updateValue(Node* head){
    Node* current=head;
    while (current != nullptr){
        if (current->charValue == "P") {
            current->charValue = "Q";
        }
        if (current->intValue == 241){
            current->intValue=243;
        }
        current=current->next;
    }

}

int main(){
    Node* head = createNode("Ø", 0.0, 0);
    head->next = createNode("R", 3.00, 0);
    head->next->next = createNode("P", 0.0, 241);
    head->next->next->next = createNode("Ø", 0.0, 0);

    cout <<"Original Linked List"<<endl;
    printList(head);

    updateValue(head);
    cout<<"after update "<<endl;
    printList(head);
    return 0;


}
