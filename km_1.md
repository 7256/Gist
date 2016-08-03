

android:怎么实现一个控件与另一个指定控件左对齐  https://segmentfault.com/q/1010000003905460


### android:ellipsize TextView省略文字的用法
當TextView的String過長超出了可視範圍，可用「省略號」來表示未顯示的文字。 有以下四種情境 (1) 「省略號」于String的開頭 設定值 android:ellipsize="start" (2) 「省略號」于String的中間 設定值 android:ellipsize="middle" (3) 「省略號」于String的結尾 設定值 android:ellipsize="end" (4) 以跑馬燈的形式輪播字串內容 設定值 android:ellipsize="marquee"

### Android ListView 避免全部選中情況下的背景變色問題

糾正也很簡單，只要在xml中的ListView中加入：
android:cacheColorHint="@android:color/transparent"
即可。


### Android 動態產生元件

Android 應用程式的開發一般都將 UI 跟 RESOURCES 的部分抽離出來，好方便管理及設計，也因此有一些 XML 檔需要撰寫，主要都是用來描述這些資源。
 

但若要自己土法練鋼寫動態產生時要怎麼作?



@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
///setContentView(R.layout.main); ///不使用 main.xml 資源
 

LinearLayout layout = new LinearLayout(this);
this.addContentView(layout, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
layout.setOrientation(LinearLayout.VERTICAL);
 

Button btn = new Button(this);
btn.SetText("Button");
layout.addView(btn, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
 

EditText txt = new EditText(this);
layout.addView(txt, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
}


相對照若用 xml 來描述的話像這樣...


```
<LinearLayout
android:orientation="vertical"
android:layout_width="fill_parent"
android:layout_height="fill_parent"
xmlns:android="HTTP://schemas.android.com/apk/res/android">
<Button
android:text="Button"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
</Button>
<EditText
android:layout_width="fill_parent"
android:layout_height="wrap_content">
</EditText>
</LinearLayout>
```