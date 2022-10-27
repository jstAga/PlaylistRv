package com.geektech.playlistrv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.geektech.playlistrv.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var songList = arrayListOf<Song>()
    private var bundle = Bundle()
    private var fragment:SecondFragment = SecondFragment()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songList.clear()
        loadData()

        val musicAdapter = MusicAdapter(songList, this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(position:Int){

        bundle.putSerializable("key", songList[position])
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).addToBackStack(null).commit()

    }

    private fun loadData(){
        songList.add(Song("Mario", "Let Me Love You","4:11","https://avatars.yandex.net/get-music-content/2383988/1cf8ab6b.a.9691367-2/400x400"))
        songList.add(Song("50 cent", "How We Do","3:55","https://avatars.yandex.net/get-music-content/42108/10510516.a.4205-1/400x400"))
        songList.add(Song("Major Lazer", "Light it up","4:20","https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"))
        songList.add(Song("Tonight", "Jay Sean", "3:30", "https://avatars.yandex.net/get-music-content/108289/c7071da5.a.6319414-1/400x400"))
        songList.add(Song("Superman", "Eminem", "4:02","https://avatars.yandex.net/get-music-content/34131/436d3796.a.59523-1/400x400"))
        songList.add(Song("Hips Don't Lie", "Shakira", "3:55", "https://avatars.yandex.net/get-music-content/33216/077459dc.a.67292-1/400x400"))
        songList.add(Song("Wake Up in the Sky", "Bruno Mars", "3:20", "https://avatars.yandex.net/get-music-content/2433207/2856015d.a.12864225-1/400x400"))
        songList.add(Song("Praise The Lord (Da Shine)", "ASAP Rocky, Skepta", "3:40", "https://avatars.yandex.net/get-music-content/99892/100b3f0b.a.5400781-1/400x400"))
        songList.add(Song("Cheap Thrills", "Sia", "3:04", "https://avatars.yandex.net/get-music-content/33216/98a90c87.a.3837950-1/400x400"))
        songList.add(Song("Seven Nation Army", "The White Stripes", "2:30", "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"))
        songList.add(Song("Seven Nation Army", "The White Stripes", "2:30", "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"))
        songList.add(Song("Seven Nation Army", "The White Stripes", "2:30", "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"))
        songList.add(Song("Seven Nation Army", "The White Stripes", "2:30", "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"))
        songList.add(Song("Seven Nation Army", "The White Stripes", "2:30", "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"))
 }
}