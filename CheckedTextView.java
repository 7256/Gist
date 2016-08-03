
/*
CheckedTextView点击后左边的图片发生变化
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckedTextView textView = (CheckedTextView)findViewById(R.id.dl_tv);

        //点击状态后变更相反，如选中变为未选中，未选中的变为选中
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textView.toggle();
                if (textView.isChecked()) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.filte, 0, 0, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
        });
    }
}