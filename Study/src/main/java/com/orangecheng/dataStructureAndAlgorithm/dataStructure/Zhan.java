package com.orangecheng.dataStructureAndAlgorithm.dataStructure;

/**
 * @className: zhan
 * @description: TODO 数据结构 - 栈
 * @author: Txc
 * @date: 2022/11/10 11:04

 * 简介：
 *      栈是一种特殊的线性表，仅能在线性表的一端操作，栈顶允许操作，栈底不允许操作。
 *
 * 特点：
 *      先进后出，或者说是后进先出，从栈顶放入元素的操作叫入栈，取出元素叫出栈。
 */
public class Zhan<T> {

    /** 栈顶指针 */
    public int top = -1;

    /** 栈的容量 */
    public int capacity = 10;

    public T[] array;

    /** 创建栈 */

    /** 入栈操作 */
    public void push(T data){
        if (array.length == capacity){

        }

    }

    /** 出栈操作 */
    public void pop(){
        if (isEmpty()){
            System.out.println("此栈为空！");
        }

    }

    /** 判断栈是否为空 */
    public boolean isEmpty(){
        return top == -1;
    }

    /** 查询栈顶的值 */
    public T peek(){
        if (isEmpty()){
            System.out.println("此栈为空！");
        }
        return array[top];
    }

    /** 栈扩容 */

}
