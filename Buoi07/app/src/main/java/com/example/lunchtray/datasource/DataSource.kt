package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

/**
 * Danh sách các món ăn có sẵn để hiển thị trong các màn hình thực đơn.
 */
object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Súp lơ",
            description = "Súp lơ trắng nguyên bông, ngâm nước muối, nướng và chiên giòn.",
            price = 7.00,
        ),
        EntreeItem(
            name = "Ớt hầm ba loại đậu",
            description = "Đậu đen, đậu đỏ, đậu thận, hầm nhừ, rắc hành tây lên trên.",
            price = 4.00,
        ),
        EntreeItem(
            name = "Mì ống nấm",
            description = "Mì penne, nấm, húng quế, cà chua mận nấu cùng tỏi và dầu ô liu.",
            price = 5.50,
        ),
        EntreeItem(
            name = "Chảo đậu đen cay",
            description = "Rau củ theo mùa, đậu đen, gia vị đặc biệt của quán, ăn kèm bơ " +
                    "và hành tây muối chua nhanh.",
            price = 5.50,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Salad mùa hè",
            description = "Cà chua cổ truyền, xà lách bơ, đào, bơ, sốt giấm balsamic.",
            price = 2.50,
        ),
        SideDishItem(
            name = "Súp bí bơ",
            description = "Bí bơ nướng, ớt chuông nướng, dầu ớt.",
            price = 3.00,
        ),
        SideDishItem(
            name = "Khoai tây cay",
            description = "Khoai tây bi, nướng rồi chiên với gia vị đặc biệt của quán.",
            price = 2.00,
        ),
        SideDishItem(
            name = "Cơm dừa",
            description = "Gạo, nước cốt dừa, chanh xanh và đường.",
            price = 1.50,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Bánh mì cuộn",
            description = "Bánh mì cuộn nướng tươi, làm tại quán.",
            price = 0.50,
        ),
        AccompanimentItem(
            name = "Quả mọng hỗn hợp",
            description = "Dâu tây, việt quất, mâm xôi và quả huckleberry.",
            price = 1.00,
        ),
        AccompanimentItem(
            name = "Rau củ muối chua",
            description = "Dưa leo và cà rốt muối chua, làm tại quán.",
            price = 0.50,
        )
    )
}