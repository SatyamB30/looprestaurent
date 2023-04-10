package service

import models.Categories
import models.SubCategories

object CategoryType {
    fun getCategory(category: String): Categories? {
        if (category.contains("Starters")) {
            return Categories.Starters
        } else if (category.contains("Main Courses")) {
            return Categories.Main_Course
        } else if (category.contains("Beverages")) {
            return Categories.Beverages
        } else if (category.contains("Desserts")) {
            return Categories.Desserts
        } else {
            return null
        }
    }

    fun getSubCategory(sub_category: String): SubCategories? {
        if (sub_category.contains("Veg")) {
            return SubCategories.Veg
        } else if (sub_category.contains("Non-Veg")) {
            return SubCategories.Non_Veg
        } else if (sub_category.contains("Alcoholic")) {
            return SubCategories.Alcoholic
        } else if (sub_category.contains("Non-Alcoholic")) {
            return SubCategories.Non_Alcoholic
        } else if (sub_category.contains("Cold")) {
            return SubCategories.Cold
        } else if (sub_category.contains("Hot")) {
            return SubCategories.Hot
        } else {
            return null
        }
    }
}