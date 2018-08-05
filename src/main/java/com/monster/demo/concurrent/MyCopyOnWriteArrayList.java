package com.monster.demo.concurrent;
/**
 * 
 * @description 在读多写少的场合，这个List的性能非常好，远远好于Vector
 * CopyOnWrite就是在写入操作时，进行一次自我复制，也就是说当这个list需要修改时候，并不修改原有的内容，
 * 而是对原有的数据进行一次复制，将修改的内容写入副本中，写完之后，再将修改完的副本替换原来的数据
 * @author guokai
 * @date 2018年8月3日
 * @version v1.0
 */
public class MyCopyOnWriteArrayList {

}
