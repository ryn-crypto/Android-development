package com.ryan.belajarandroiddasar

import android.content.Context
import android.service.autofill.FieldClassification.Match
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.ViewAssertion.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
//    @get:Rule
//    var mainActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    lateinit var mainActivityScenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        mainActivityScenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testSayHello() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val name = "ryan"

        onView(withId(R.id.nameEditText))
            .perform(typeText(name))

        onView(withId(R.id.sayHelloButton))
            .perform(click())

        onView(withId(R.id.sayHelloTextView))
            .check(matches(withText(context.getString(R.string.sayHelloTextView, name))))
    }


//    @After
//    fun tearDown() {
//        mainActivityScenario.close()
//    }
}