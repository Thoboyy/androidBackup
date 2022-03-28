package fr.isen.BOUE.androiderestaurant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import fr.isen.BOUE.androiderestaurant.databinding.FragmentImageBinding


class ImageFragment(private val url: String?) : Fragment() {
    private lateinit var binding: FragmentImageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get().load(url).placeholder(R.drawable.donnut).into(binding.imageItem)
    }
}