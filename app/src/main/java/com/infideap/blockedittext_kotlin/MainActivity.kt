package com.infideap.blockedittext_kotlin

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.text.InputType
import com.infideap.blockedittext.BlockEditText
import com.infideap.blockedittext.CardPrefix

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amexEditText = findViewById<BlockEditText>(R.id.blockEditText_amex)
        amexEditText.setNumberOfBlock(3)
        amexEditText.setDefaultLength(4)
        amexEditText.setLengthAt(1,6)
        amexEditText.setLengthAt(2,5)
        amexEditText.setHint("Amex")
        amexEditText.setSeparatorCharacter('-')
        amexEditText.setInputType(InputType.TYPE_CLASS_NUMBER)
        amexEditText.setEdiTextBackground(ContextCompat.getDrawable(this, R.drawable.selector_edittext_round_border_line))

        val cardEditText = findViewById<BlockEditText>(R.id.blockEditText_card)
        cardEditText.addCardPrefix(CardPrefix.amex(this))

        val icNumberEditText = findViewById<BlockEditText>(R.id.blockEditText_ic_number)
        icNumberEditText.setNumberOfBlock(3)
        icNumberEditText.setDefaultLength(6)
        icNumberEditText.setLengthAt(1, 2)
        icNumberEditText.setLengthAt(2, 4)

        icNumberEditText.setSelection(0)

    }
}
