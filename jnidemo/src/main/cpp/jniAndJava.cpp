//
// Created by 王立 on 2019-06-02.
//
#include <jni.h>
#include <string.h>
#include "Person.h"

extern "C" {

//调用MainActivity中的两个方法，得到两个数，相加，再显示到TextView上
JNIEXPORT void JNICALL
Java_com_enniu_jnidemo_MainActivity_jniInvokeJava(JNIEnv *env, jobject thiz) {
    //找到MainActivity类
    jclass mainActivityClazz = env->FindClass("com/enniu/jnidemo/MainActivity");

    //找到getNum1()方法
    jmethodID getNum1MethodId = env->GetMethodID(mainActivityClazz, "getNum1", "()I");
    //找到getNum2()方法
    jmethodID getNum2MethodId = env->GetMethodID(mainActivityClazz, "getNum2", "()D");

    //因为getNum1()返回值是Int，所以调用CallIntMethod
    jint num1 = env->CallIntMethod(thiz, getNum1MethodId);
    //因为getNum2()返回值是Double，所以调用CallDoubleMethod
    jdouble num2 = env->CallDoubleMethod(thiz, getNum2MethodId);

    //两数相加
    jdouble result = num1 + num2;

    //设置给TextView
    jmethodID showResultMethodId = env->GetMethodID(mainActivityClazz, "showResult", "(D)V");
    //showResult()方法的返回值是void，所以调用CallVoidMethod()方法
    env->CallVoidMethod(thiz, showResultMethodId, result);
}

JNIEXPORT jlong JNICALL
Java_com_enniu_jnidemo_MainActivity_createPerson(JNIEnv *env, jobject thiz, jstring name) {
    Person *p = new Person();
    //返回指针，供Java层保存
    return reinterpret_cast<uintptr_t>(p);
}

JNIEXPORT void JNICALL
Java_com_enniu_jnidemo_MainActivity_setPersonName(JNIEnv *env, jobject thiz, jlong ptr,
                                                  jstring name) {
    //强转到Person指针
    Person *person = reinterpret_cast<Person *>(ptr);
    person->setName(env->GetStringUTFChars(name, NULL));
}

JNIEXPORT jstring JNICALL
Java_com_enniu_jnidemo_MainActivity_getPersonName(JNIEnv *env, jobject thiz, jlong ptr) {
    //强转到Person指针
    Person *person = reinterpret_cast<Person *>(ptr);
    return env->NewStringUTF(person->getName());
}


}

