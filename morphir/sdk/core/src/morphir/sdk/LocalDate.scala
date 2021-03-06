/*
Copyright 2020 Morgan Stanley

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package morphir.sdk

object LocalDate {
  type LocalDate = java.time.LocalDate

  type Month = java.time.Month

  val Jan: Month = java.time.Month.JANUARY
  val Feb: Month = java.time.Month.FEBRUARY
  val Mar: Month = java.time.Month.MARCH
  val Apr: Month = java.time.Month.APRIL
  val May: Month = java.time.Month.MAY
  val Jun: Month = java.time.Month.JUNE
  val Jul: Month = java.time.Month.JULY
  val Aug: Month = java.time.Month.AUGUST
  val Sep: Month = java.time.Month.SEPTEMBER
  val Oct: Month = java.time.Month.OCTOBER
  val Nov: Month = java.time.Month.NOVEMBER
  val Dec: Month = java.time.Month.DECEMBER

  type DayOfWeek = java.time.DayOfWeek
  val Sunday: DayOfWeek    = java.time.DayOfWeek.SUNDAY
  val Monday: DayOfWeek    = java.time.DayOfWeek.MONDAY
  val Tuesday: DayOfWeek   = java.time.DayOfWeek.TUESDAY
  val Wednesday: DayOfWeek = java.time.DayOfWeek.WEDNESDAY
  val Thursday: DayOfWeek  = java.time.DayOfWeek.THURSDAY
  val Friday: DayOfWeek    = java.time.DayOfWeek.FRIDAY
  val Saturday: DayOfWeek  = java.time.DayOfWeek.SATURDAY

}
