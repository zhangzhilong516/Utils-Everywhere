package com.linsh.utilseverywhere.interfaces;

/**
 * <pre>
 *    author : Senh Linsh
 *    github : https://github.com/SenhLinsh
 *    date   : 2020/02/23
 *    desc   :
 * </pre>
 */
public interface Consumer<T> {

    /**
     * 消费给定的值
     *
     * @param t 被消费的值
     */
    void accept(T t);
}