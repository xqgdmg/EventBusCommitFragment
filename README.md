# EventBusCommitFragment
EventBusCommitFragment
 * 1：切换 Fragment
 * 华为报错 java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState，但是不会崩溃
 * oppo 不会报错
 * 解决方法：切换的时候 commit() 改为 commitAllowingStateLoss()
 *
 * 2：改变文字
 * 都可以，没有问题
