/* Copyright 2014 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.translation.characters;

import org.junit.Test;

/**
 * Tests for ASCII Heading for code used in documentation.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.2 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.2
 */
public class Test_CodeForDocs {

	@Test
	public void test_LatexWrong(){
		this.output("LaTeX Wrongs");

		String text = "ä ö <b>ü</b>";
		System.out.println(new Text2Latex().translateCharacters(text));
		System.out.println(new de.vandermeer.translation.combinations.Text2Latex().translate(text));

		this.output();
	}

	@Test
	public void test_CharToX(){
		this.output("char text to X");

		String text = "ä ö ü Š β … € ™ ↔";
		System.out.println(new Text2AsciiDoc().translateCharacters(text));
		System.out.println(new Text2Html().translateCharacters(text));
		System.out.println(new Text2Latex().translateCharacters(text));

		this.output();
	}

	@Test
	public void test_FormattingToX(){
		this.output("formatting text to X");

		String text = "<b>bold</b>, <i>italic</i>, H<sub>2</sub>O, x<sup>y</sup>";
		System.out.println(new de.vandermeer.translation.helements.Text2AsciiDoc().translateHtmlElements(text));
		System.out.println(new de.vandermeer.translation.helements.Text2Html().translateHtmlElements(text));
		System.out.println(new de.vandermeer.translation.helements.Text2Latex().translateHtmlElements(text));

		this.output();
	}

	@Test
	public void test_CombinedToX(){
		this.output("combined text to X");

		String text = "<b>bold ä ö ü</b>, <i>italic Š β …</i>, €<sub>5</sub>O, ™<sup>↔</sup>";
		System.out.println(new de.vandermeer.translation.combinations.Text2AsciiDoc().translate(text));
		System.out.println(new de.vandermeer.translation.combinations.Text2Html().translate(text));
		System.out.println(new de.vandermeer.translation.combinations.Text2Latex().translate(text));

		this.output();
	}


	protected void output(String str){
		System.out.println(str);
		System.out.println("----------------------------------------------------------------------------------------");
	}

	protected void output(){
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println();
	}

}
