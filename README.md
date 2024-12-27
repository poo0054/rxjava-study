# rxjava-study

名词的翻译

* `Reactive` 直译为反应性的，有活性的，根据上下文一般翻译为反应式、响应式
* `Iterable` 可迭代对象，支持以迭代器的形式遍历，许多语言中都存在这个概念
* `Observable` 可观察对象，在Rx中定义为更强大的Iterable，在观察者模式中是被观察的对象，一旦数据产生或发生变化，会通过某种方式通知观察者或订阅者
* `Observer` 观察者对象，监听Observable发射的数据并做出响应，Subscriber是它的一个特殊实现
* `emit` 直译为发射，发布，发出，含义是Observable在数据产生或变化时发送通知给Observer，调用Observer对应的方法，文章里一律译为发射
* `items` 直译为项目，条目，在Rx里是指Observable发射的数据项，文章里一律译为数据，数据项