package vn.edu.tdc.cal_week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalActivity extends AppCompatActivity {

    EditText edtOperator, edtRes;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnRes, btnAdd, btnSub, btnMul, btnDiv, btnClean;
    float num1, num2;
    boolean btnAddState, btnSubState, btnMulState, btnDivState;
    String chuoi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_layout);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnCong);
        btnSub = (Button) findViewById(R.id.btnTru);
        btnMul = (Button) findViewById(R.id.btnNhan);
        btnDiv = (Button) findViewById(R.id.btnChia);
        btnClean = (Button) findViewById(R.id.btnC);
        btnRes = (Button) findViewById(R.id.btnBang);
        edtRes = (EditText) findViewById(R.id.edtRes);
        edtOperator = (EditText) findViewById(R.id.edtOperator);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtOperator == null) {
                    edtOperator.setText("");
                } else {
                    num1 = Float.parseFloat(edtOperator.getText() + "")  ;
                    btnAddState = true;
                }
                edtOperator.setText(null);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edtOperator.getText() + "");
                btnSubState = true;
                edtOperator.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edtOperator.getText() + "");
                btnMulState = true;
                edtOperator.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edtOperator.getText() + "");
                btnDivState = true;
                edtOperator.setText(null);
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(edtOperator.getText() + "");
                if (btnAddState == true) {
                    edtOperator.setText(num1 + num2 + "");
                    btnAddState = false;
                }
                if (btnSubState == true) {
                    edtOperator.setText(num1 - num2 + "");
                    btnSubState = false;
                }
                if (btnMulState == true) {
                    edtOperator.setText(num1 * num2 + "");
                    btnMulState = false;
                }
                if (btnDivState == true) {
                    edtOperator.setText(num1 / num2 + "");
                    btnDivState = false;
                }
            }
        });
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText("");
            }
        });


    }

}
