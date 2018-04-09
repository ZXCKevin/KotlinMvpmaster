package com.hazz.kotlinmvp.rx.scheduler

/**
 * Created by zxc on 2017/11/17.
 * desc:
 */

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
