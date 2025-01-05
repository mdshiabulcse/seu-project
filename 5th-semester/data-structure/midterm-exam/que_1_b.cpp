//
// Created by VEH-IT on 1/5/2025.
//

#include "que_1_b.h"
#include <iostream>
using namespace std;


struct Node{
    int a;
    float b;
    char c;
    string name;
    Node* pre;
    Node* next;
};

Node* createNode(int a, float b, char c, string name){
    Node* newNode=(Node*) malloc(sizeof(Node));
    if (newNode == nullptr){
        cout << "Invalid Data" << endl;
        exit(1);
    }
    newNode->a=a;
    newNode->b=b;
    newNode->c=c;
    newNode->name=name;
    newNode->pre= nullptr;
    newNode->next= nullptr;
    return newNode;

}
void displayList(Node* head){
    Node* data=head;
    while (data != nullptr){
        cout << "["<<data->a<<","<<data->b
    }
}
