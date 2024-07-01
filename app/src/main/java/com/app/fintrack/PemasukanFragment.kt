import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.app.fintrack.R

class PemasukanFragment : Fragment() {

    private var selectedView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pemasukan, container, false)

        val gajiLayout: LinearLayout = view.findViewById(R.id.gajiLayout)
        val investasiLayout: LinearLayout = view.findViewById(R.id.investasiLayout)
        val sewaLayout: LinearLayout = view.findViewById(R.id.sewaLayout)
        val royaltiLayout: LinearLayout = view.findViewById(R.id.royaltiLayout)
        val kategoriBaruLayout: LinearLayout = view.findViewById(R.id.kategoriBaruLayout)

        val greyColor = ContextCompat.getColor(requireContext(), R.color.dusty_grey)

        gajiLayout.setOnClickListener { changeBackgroundColor(it, greyColor) }
        investasiLayout.setOnClickListener { changeBackgroundColor(it, greyColor) }
        sewaLayout.setOnClickListener { changeBackgroundColor(it, greyColor) }
        royaltiLayout.setOnClickListener { changeBackgroundColor(it, greyColor) }
        kategoriBaruLayout.setOnClickListener { changeBackgroundColor(it, greyColor) }

        return view
    }

    private fun changeBackgroundColor(view: View, selectedColor: Int) {
        selectedView?.background = null
        view.setBackgroundColor(selectedColor)
        selectedView = view
    }
}
