# 给任意View添加Loading状态

## 使用

```java
class Usage {
    void simpleUse() {
        // 添加Loading
        WrapLoading.with(helloTxt).show();

        // 取消Loading
        // 保留LoadingView
        WrapLoading.with(helloTxt).dismiss();
        // 或
        // 取消LoadingView
        WrapLoading.release(helloTxt);
    }
}
```