package com.example.sliderimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://as01.epimg.net/meristation/imagenes/2021/09/18/reportajes/1631950651_091236_1631950727_noticia_normal.jpg"))
        list.add(CarouselItem("https://www.eluniverso.com/resizer/jU7aoAaOdtqWEpbj3n2mFdA1sD8=/2014x1340/smart/filters:quality(70)/cloudfront-us-east-1.images.arcpublishing.com/eluniverso/SL2NKWVRHNBJFNUR6QTAAGQDAA.jpg"))
        list.add(CarouselItem("https://www.cinemascomics.com/wp-content/uploads/2020/06/84606465_593032248207294_2171927152660621213_n.jpg.webp"))
        carousel.addData(list)

        //librery
        //https://github.com/ImaginativeShohag/Why-Not-Image-Carousel
    }


}