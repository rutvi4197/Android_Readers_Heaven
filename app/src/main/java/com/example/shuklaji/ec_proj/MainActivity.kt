package com.example.shuklaji.ec_proj

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.book_ticket.view.*

class MainActivity : AppCompatActivity() {

    var adapter:bookadapter?=null
    var listofbook = ArrayList<book>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listofbook.add(book("book1","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book2","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book3","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book4","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book5","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book6","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book7","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book8","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book9","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        listofbook.add(book("book10","Half Girlfriend is an Indian romantic drama Hindi film based on the novel of the same name written by Chetan Bhagat. The film is directed by Mohit Suri and features Arjun Kapoor and Shraddha Kapoor in the lead roles.",R.drawable.downloaded))
        adapter= bookadapter(this,listofbook);

        grd1.adapter = adapter
    }

    class bookadapter:BaseAdapter{

        var listofbook = ArrayList<book>()
        var context: Context?=null

        constructor(context:Context, listofbook:ArrayList<book>):super(){

            this.context=context
            this.listofbook=listofbook
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

                val Book = this.listofbook[position]
                var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                var bookview = inflater.inflate(R.layout.book_ticket,null)
                bookview.img1.setImageResource(Book.image!!)

                bookview.img1.setOnClickListener {

                    val intent = Intent(context, book_detail::class.java)
                    intent.putExtra("name",Book.name!!)
                    intent.putExtra("des",Book.des!!)
                    intent.putExtra("image",Book.image!!)
                    context!!.startActivity(intent!!)
                }
                bookview.txt1.text=Book.name!!

                return bookview
        }

        override fun getItem(position: Int): Any {

            return listofbook[position]
        }

        override fun getItemId(position: Int): Long {

            return position.toLong()
        }

        override fun getCount(): Int {

                return listofbook.size
        }


    }
}
