package se.magictechnology.piax24mar


import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewInteraction
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import se.magictechnology.piax24mar.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val materialButton = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val materialButton4 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val materialButton5 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val materialButton6 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val materialButton7 = onView(
            allOf(
                withId(R.id.resetButton), withText("Reset"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton7.perform(click())

        val materialButton8 = onView(
            allOf(
                withId(R.id.nameButton), withText("Button"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton8.perform(click())

        val textView = onView(
            allOf(
                withId(R.id.headerTextview), withText("1"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        textView.check(matches(withText("1")))
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
