#include <iostream>
using namespace std;

// Node structure
struct Node {
    int key;
    Node* left, * right;
    Node(int item) {
        key = item;
        left = right = nullptr;
    }
};

// Class to represent a Binary Search Tree
class BST {
    Node* root;

public:
    BST() {
        root = nullptr;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    void inorder() {
        inorderRec(root);
    }

    void preorder() {
        preorderRec(root);
    }

    void postorder() {
        postorderRec(root);
    }

private:
    Node* insertRec(Node* node, int key) {
        if (node == nullptr) {
            return new Node(key);
        }
        if (key < node->key) {
            node->left = insertRec(node->left, key);
        }
        else if (key > node->key) {
            node->right = insertRec(node->right, key);
        }
        return node;
    }

    void inorderRec(Node* node) {
        if (node != nullptr) {
            inorderRec(node->left);
            cout << node->key << " ";
            inorderRec(node->right);
        }
    }

    void preorderRec(Node* node) {
        if (node != nullptr) {
            cout << node->key << " ";
            preorderRec(node->left);
            preorderRec(node->right);
        }
    }

    void postorderRec(Node* node) {
        if (node != nullptr) {
            postorderRec(node->left);
            postorderRec(node->right);
            cout << node->key << " ";
        }
    }
};

int main() {
    BST tree;
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    cout << "In-order traversal: ";
    tree.inorder();
    cout << endl;

    cout << "Pre-order traversal: ";
    tree.preorder();
    cout << endl;

    cout << "Post-order traversal: ";
    tree.postorder();
    cout << endl;

    return 0;
}
