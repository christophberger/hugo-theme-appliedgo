{{ if isset .Site.Params "authors" }}
	<style>
		.author {
			background-color: white
			padding: 0.5em 0.5em 0.5em 0.5em; 
		}
		.author_img {
			float:left; 
			padding: 0.5em 0.5em 0.5em 0.5em; 
		}
		.author_text {
		}
	</style>

	<div class="author doc" >

		<div class="author_img">
			{{ .Page.Params.avatar }}
		</div> 

		<div class="author_text" >
			<p>This is a guest post by {{ .Page.Params.author }}</p>
			<p>Contact the author:</p>
			<p>{{ .Page.Params.email }}</p>
			<p>{{ .Page.Params.homepage }}</p>
		</div>

	</div>
	</a>
{{ end }}
